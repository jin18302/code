select count(id)as fish_count
from fish_info
where substr(time, 1, 4) = '2021'

