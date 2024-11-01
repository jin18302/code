-- 코드를 입력하세요
SELECT dr_name, dr_id, MCDP_CD,substr(HIRE_YMD, 1, 10)as HIRE_YMD
from doctor
where mcdp_cd='cs'or mcdp_cd='gs'
order by HIRE_YMD desc, dr_name