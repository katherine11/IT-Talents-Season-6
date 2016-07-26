import Test.QuickCheck

{- 
Задача 1. 
Напишете функция mypow n k, която повдига n на степен k. 
Същото като n ^ k, което разбира се не може да използвате. 
-}


{-
Задача 2.
Напишете функция mysumpow k xs, която взима число k и списък xs и
и връща сумата x0 ^ k + x1 ^ k + .. + xN ^ k.
Напишете функцията по два начина:
а). рекурсивно, наименувайте функцията mysumpow_rec 
б). използвайки функцията sum  и "list comprehension", наименувайте функциата mysumpow_lc
-}


{-
Задача 3.
Напишете функция mytake n xs, която връща първите n елемента на списъка xs. 
Ако n > length xs, функцията връща целия списък. 

Не може да използвате функцията take, която прави точно това. 
-}


{-
Задача 4.
Напишете функция myreverse xs, която обръща списъка xs.
    Пример: myreverse [1, 2, 3] = [3, 2, 1]

Не може да използвате функцията reverse, която прави точно това.
-}


{-
Задача 5.
Напишете функция myprimefactors n >= 2, която връща списък с простите множители на n,
подредени в нарастващ ред. 
    Пример: 20 = 2 * 2 * 5, следователно
    myprimefactors 20 = [2, 2, 5]
    myprimefactors 1 = []

Може да използвате функцията myprime n, от задача 6 от домашното, без да се налага да я предефинирате.
-}
myprime :: Integer -> Bool
-- копирайте решението от домашното


{-
Задача 6.
Напишете функция mysentences subjects verbs objects, която връща списък
с всички изречения от вида subject verb object (SVO), където:
 - subject e елемент на списъка subjects,
 - verb е елемент на списъка verbs,
 - object e елемент на списъка objects.

    Пример: mysentences ["Sam", "Mary"] ["loves", "hates"] ["apples", "dogs"] = 
        [
            "Sam loves apples", "Sam loves dogs","
            "Sam hates apples", "Sam hates dogs",
            "Mary loves apples", "Mary loves dogs",
            "Mary hates apples", "Mary hates dogs"
        ]
-}


{- QuickCheck properties (използват се за автоматизирано тестване) -}
-- функцията mypow и (^) трябва да връщат един и същи резултат
qc_mypow n k = (k >= 0) ==> n `mypow` k == n ^ k

-- дали използваме рекурсия или "list comprehension" не би трябвало да има значение
qc_mysumpow k xs = (k >= 0) ==> mysumpow_rec k xs == mysumpow_lc k xs

-- резултатът от mytake трябва да е същият като този на take
qc_mytake n xs = (n >= 0) ==> mytake n xs == take (fromIntegral n) xs where types = xs::[Integer]

-- резултатът от myreverse трябва да е същият като този на reverse
qc_myreverse_1 xs = myreverse xs == reverse xs where types = xs::[Integer]
-- ако обърнем списъка 2 пъти трябва да завършим със списъка, с който сме започнали
qc_myreverse_2 xs = myreverse (myreverse xs) == xs where types = xs::[Integer]

-- всички прости множители трябва да са прости числа
qc_myprimefactors_1 n = (n > 1) ==> and([myprime p | p <- myprimefactors n])
-- произведението на простите множители трябва да е числото n
qc_myprimefactors_2 n = (n > 1) ==> product (myprimefactors n) == n 


main :: IO()
main = do
    quickCheck qc_mypow
    quickCheck qc_mysumpow
    quickCheck qc_mytake
    quickCheck qc_myreverse_1
    quickCheck qc_myreverse_2
    quickCheck qc_myprimefactors_1
    quickCheck qc_myprimefactors_2
