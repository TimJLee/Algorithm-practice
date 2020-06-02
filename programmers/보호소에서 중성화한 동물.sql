-- 내 풀이 
SELECT i.animal_id, i.animal_type, i.name
from animal_ins i join animal_outs o
on i.animal_id = o.animal_id
where (i.sex_upon_intake = "Intact male" and o.sex_upon_outcome = "Neutered Male") or
    (i.sex_upon_intake = "Intact female" and o.sex_upon_outcome = "Spayed Female")
order by i.animal_id;

-- substring 을 이용한 풀이 
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
FROM ANIMAL_INS as i 
WHERE SUBSTRING(SEX_UPON_INTAKE,1,1) = 'I' 
and i.ANIMAL_ID in (SELECT ANIMAL_ID FROM ANIMAL_OUTS as o 
                   WHERE SUBSTRING(SEX_UPON_OUTCOME,1,1) != 'I')