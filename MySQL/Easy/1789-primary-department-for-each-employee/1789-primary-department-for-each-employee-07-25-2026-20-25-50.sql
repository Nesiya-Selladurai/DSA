# Write your MySQL query statement below
select employee_id , 
case
when count(*)>1 and MAX(primary_flag = 'Y') = 1 then max(case when primary_flag='Y' then department_id end)
when count(*)=1  then department_id
end as department_id 
from Employee  
group by employee_id;