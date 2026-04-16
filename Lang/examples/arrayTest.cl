LET hand = [10, 7, 3]
SHOW hand

SHOW hand[0]
SHOW hand[1]
SHOW hand[2]

APPEND 5 TO hand
SHOW hand

LET x = hand[0] + hand[3]
SHOW x

LET i = 0
WHILE i < 4 DO
    SHOW hand[i]
    i = i + 1
END
