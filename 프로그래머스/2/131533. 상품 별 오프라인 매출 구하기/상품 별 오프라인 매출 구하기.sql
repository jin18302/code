
SELECT PRODUCT_CODE, SUM(sales_amount * PRICE) AS SALES
FROM PRODUCT P INNER JOIN OFFLINE_SALE O
ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_ID
ORDER BY SALES DESC, PRODUCT_CODE
