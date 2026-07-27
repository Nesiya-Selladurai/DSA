# Write your MySQL query statement below
select (case 
when income<20000 then 'Low Salary'
#when income in between (20000,50000) then 'Average Salary'
#else 'High Salary' 
end 
) as category ,ifnull(count(*),0) as accounts_count
from Accounts where income<20000

union

select (case 
when income>50000 then 'High Salary'
end 
) as category ,ifnull(count(*),0) as accounts_count
from Accounts where income>50000

union

select ifnull(case 
when income>=20000 and income<=50000 then 'Average Salary'
end 
,'Average Salary') as category , ifnull(count(*),0) as accounts_count
from Accounts where income>=20000 and income <=50000;