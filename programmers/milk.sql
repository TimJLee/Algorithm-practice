SELECT cart_id from cart_products
where name='요거트' and cart_id in (
                select cart_id
                from cart_products
                where name='우유'
                group by cart_id
                )
group by cart_id
order by cart_id;