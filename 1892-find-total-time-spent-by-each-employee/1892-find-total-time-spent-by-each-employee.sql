SELECT event_day AS day, emp_id, 
SUM(out_time-in_time) as total_time 
from Employees 
group by day, emp_id order by total_time;
