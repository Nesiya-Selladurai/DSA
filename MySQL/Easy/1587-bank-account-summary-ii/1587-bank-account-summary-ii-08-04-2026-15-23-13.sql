# Write your MySQL query statement below
select * from(
select u.name as NAME ,case when sum(t.amount)>10000 then sum(t.amount) end
 as BALANCE from Users u join Transactions t 
on u.account=t.account group by t.account)
as e where e.BALANCE is not null;