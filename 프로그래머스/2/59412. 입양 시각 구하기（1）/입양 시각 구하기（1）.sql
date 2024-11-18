

SELECT HOUR(datetime)as hour,count(*)as count
from animal_outs
where HOUR(datetime) between 9 and 19
group by hour
order by hour
