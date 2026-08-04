# Write your MySQL query statement below

select player_id , event_date as first_login 
from (
    select *,row_number() over(partition by player_id order by event_date) as rnk
    from Activity
)
as e where e.rnk=1;
