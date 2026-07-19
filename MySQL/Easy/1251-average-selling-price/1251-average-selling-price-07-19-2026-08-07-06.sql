# Write your MySQL query statement below
select p.product_id ,
ifnull(
    round( 
     sum( 
         case when u.purchase_date  between p.start_date and p.end_date then u.units* p.price
         else 0
    end)
/
     sum(
         case when u.purchase_date  between p.start_date and p.end_date then u.units
         else 0
    end),2),0)
    as average_price 
from Prices p left join UnitsSold u 
on p.product_id = u.product_id
group by p.product_id
;