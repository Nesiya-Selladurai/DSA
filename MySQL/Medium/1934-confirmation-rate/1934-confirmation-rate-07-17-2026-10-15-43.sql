# Write your MySQL query statement below
select 
s.user_id,round( sum(case when c.action='confirmed' then 1.0 else 0.0 end) / sum(
case when c.user_id!=null then 0.0 else 1.0 end),2 )
as confirmation_rate
from Signups s left join Confirmations c 
on s.user_id = c.user_id 
group by user_id;