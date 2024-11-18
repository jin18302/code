select category, count(*)as products
from(
    SELECT product_id, substr(product_code,1,2)as category
    from product
)a
group by category
