# Write your MySQL query statement below

select product.product_name, sales.year, sales.price
from product
inner join sales
on sales.product_id = product.product_id;

