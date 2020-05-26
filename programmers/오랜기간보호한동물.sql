-- 코드를 입력하세요
/*
not exists 사용한 풀이 
<맞는풀이>. null값에 특정 값 집어넣기 -> coalesce 사용
SELECT COALESCE(i.name,"as"), i.datetime
from animal_ins i
WHERE NOT EXISTS (SELECT i.name FROM animal_outs o where i.name = o.name)
# and i.name is not null
order by i.datetime
limit 3;
*/
# null 값 다른 값으로 출력하기 mysql -> COALESCE(i.name,"as")

# ANIMAL_OUTS 테이블의 ANIMAL_ID는 ANIMAL_INS의 ANIMAL_ID의 외래 키입니다. name필드는 primary key 가 아니므로 중복된 값 들어올 수 있음. 

/*
not in 사용한 풀이
<맞는풀이>
SELECT NAME, DATETIME 
FROM ANIMAL_INS
WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_OUTS)
ORDER BY DATETIME ASC LIMIT 3;
*/

-- I.NAME, I.DATETIME

/*
left join 사용한 풀이
<맞는풀이. 주석처리한 부분도 맞음>
*/
SELECT i.name name, i.datetime datetime
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.animal_id IS NULL
-- WHERE O.SEX_UPON_OUTCOME IS NULL
ORDER BY I.DATETIME
limit 3;