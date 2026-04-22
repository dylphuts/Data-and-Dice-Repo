LET score = 0
LET i = 0
LET hand = [10, 7]
APPEND 5 TO hand

SHOW hand[0]
SHOW hand[1]
SHOW hand[2]

WHILE i < 3 DO
    score = score + hand[i]
    i = i + 1
END

SHOW score

IF score > 21 THEN
    SHOW "Bust"
ELSE
    SHOW "Safe"
END
