-- 코드를 입력하세요
SELECT animal_id, name,substr(date(datetime), 1,10)as '날짜'
from animal_ins
order by animal_id
