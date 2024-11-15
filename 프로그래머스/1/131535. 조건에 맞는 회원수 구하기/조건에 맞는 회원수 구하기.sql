
SELECT count(*)as user
from 
(   select *
    from user_info
    where joined like "%2021%" 
) a
where age between 20 and 29