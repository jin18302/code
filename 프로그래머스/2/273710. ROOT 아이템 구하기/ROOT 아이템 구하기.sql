-- 코드를 작성해주세요
select i.item_id as item_id, i.item_name as item_name
from item_info i inner join item_tree t
on i.item_id = t.item_id
where t.parent_item_id is null