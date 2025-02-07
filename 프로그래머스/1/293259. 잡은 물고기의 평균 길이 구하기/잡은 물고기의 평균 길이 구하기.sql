select round(avg(a.length), 2)as average_length
from
(
select 
case 
when length is null then 10
else length end as length
from FISH_INFO
)a



