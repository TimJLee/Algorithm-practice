-- 코드를 입력하세요

SELECT COALESCE(i.name,"as"), i.datetime
from animal_ins i
WHERE NOT EXISTS (SELECT i.name FROM animal_outs o where i.name = o.name)
-- and i.name is not null
order by i.datetime
limit 3; -- 상위 3줄만 출력

-- null 값 다른 값으로 출력하기 mysql -> COALESCE(i.name,"as")

-- ANIMAL_OUTS 테이블의 ANIMAL_ID는 ANIMAL_INS의 ANIMAL_ID의 외래 키입니다. name필드는 primary key 가 아니므로 중복된 값 들어올 수 있음. 


/*
not exists 대신 not in 사용
SELECT NAME, DATETIME 
FROM ANIMAL_INS
WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_OUTS)
ORDER BY DATETIME ASC LIMIT 3;
*/

/*
left inner join
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
limit 3;
*/


