select 
g.score as score, e.emp_no as emp_no, 
e.emp_name as emp_name, e.position as position,
e.email as email
from
(
select sum(score) as score, emp_no
from hr_grade 
group by emp_no
order by score desc
limit 1
)as g 
inner join hr_employees e
on g.emp_no = e.emp_no 
inner join hr_department d
on e.dept_id = d.dept_id

