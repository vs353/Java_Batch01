set serveroutput on

create or replace package emp_package
 as
       PROCEDURE UPDATE_SAL(
            job IN varchar2,
            min_sal IN number,
            max_sal IN number
          ) ;
      function GET_SERVICE_YEAR1(eid in number) return number;
 end;
 /
 
 create or replace package body emp_package
 as
        PROCEDURE UPDATE_SAL(
            job IN varchar2,
            min_sal IN number,
            max_sal IN number
          ) IS
          BEGIN
            IF min_sal > max_sal THEN
              RAISE_APPLICATION_ERROR(-20001, 'Maximum salary cannot be less than minimum salary');
            END IF;
        
            UPDATE EMP SET SAL = LEAST(GREATEST(SAL, min_sal), max_sal)
            WHERE JOB = job;
        
            IF SQL%NOTFOUND THEN
              RAISE_APPLICATION_ERROR(-20002, 'Invalid job name: ' || job);
            END IF;
          EXCEPTION
            WHEN OTHERS THEN
              RAISE_APPLICATION_ERROR(-20003, 'Error updating salaries: ' || SQLERRM);
          END UPDATE_SAL;
       
    
        function GET_SERVICE_YEAR1(eid in number)
        return number
        is
        service number;
        begin
           select FLOOR((to_date(SYSDATE) - to_date(hiredate)) / 365) into service from emp1 where empno=eid;
           return service;
        exception
            when NO_DATA_FOUND then
                 dbms_output.put_line('Error from Procedure . Employee Number Does Not Exist :( ');
        end GET_SERVICE_YEAR1;
        
end;
/

EXECUTE DBMS_OUTPUT.PUT_LINE('Approximately .... ' ||GET_SERVICE_YEAR1(&eid) || ' years')


variable jtype varchar2(20);
variable msal number;
variable mxsal number;
execute UPDATE_SAL('ANALYST', 1000, 3000);