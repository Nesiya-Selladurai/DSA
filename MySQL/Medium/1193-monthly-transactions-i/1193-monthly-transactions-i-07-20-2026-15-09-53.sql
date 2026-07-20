# Write your MySQL query statement below
 select date_format(a.trans_date,'%Y-%m') as month
 , a.country , count(a.state) as trans_count ,
  sum(
    case when a.state ='approved' then 1 else 0 end
 ) as approved_count, 
 sum(a.amount) as trans_total_amount , 
 sum(case when a.state='approved' then a.amount else 0 end) as approved_total_amount
from Transactions a join Transactions b
on a.id=b.id  group by month,country
; 