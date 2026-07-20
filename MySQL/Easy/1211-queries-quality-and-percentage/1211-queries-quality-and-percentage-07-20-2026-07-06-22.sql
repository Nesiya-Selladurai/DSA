# Write your MySQL query statement below
select query_name , round( avg(
        cast(rating as decimal) / position
),2) as quality , round( sum(case when rating<3 then 1.0 else 0.0 end)/count(*) *100 , 2) as poor_query_percentage
from Queries group by query_name;