 select *
 from (SELECT
    u.user_id as user_id,
    (
        SELECT MAX(l.time_stamp)
        FROM Logins l
        WHERE l.user_id = u.user_id
          AND YEAR(l.time_stamp) = 2020
    ) AS last_stamp
FROM Logins u
  ) t where last_stamp is not null
group by user_id;