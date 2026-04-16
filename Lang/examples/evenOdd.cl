INPUT start
INPUT end
WHILE start <= end DO
    SHOW start
    IF start % 2 == 0 THEN
        SHOW "even"
    ELSE
        SHOW "odd"
    END
    start = start + 1
END
