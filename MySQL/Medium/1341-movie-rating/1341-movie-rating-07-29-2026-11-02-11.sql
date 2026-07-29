# Write your MySQL query statement below

(select u.name as results from Users u join MovieRating m on u.user_id=m.user_id
group by u.name order by count(m.rating) desc,u.name limit 1)
union all
(select a.title as results from Movies a join MovieRating b
on a.movie_id=b.movie_id 
where date_format(b.created_at,'%Y-%m')='2020-02'
group by a.movie_id order by avg(b.rating) desc,a.title limit 1);