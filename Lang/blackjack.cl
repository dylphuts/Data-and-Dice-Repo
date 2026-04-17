SHOW "Welcome to Blackjack"
SHOW " "

LET playerScore = 0
LET playerHand = []
LET playerSize = 0
LET dealerScore = 0
LET dealerHand = []
LET dealerSize = 0
LET deck = []
LET drawn = []
LET drawnSize = 0
LET i = 0

//---Build deck
WHILE i < 52 DO
    LET cardVal = (i % 13) + 1
    IF cardVal > 10 THEN
        cardVal = 10
    END
    IF cardVal == 1 THEN
        cardVal = 11
    END
    APPEND cardVal TO deck
    i = i + 1
END

// --- Draw helper block (reuse this pattern each time you need a card) ---
// Draw card 1 - player
LET cardIndex = RANDOM(0, 51)
LET alreadyDrawn = 0

//---- Search drawn array for the index of our randomly generated index 
LET j = 0
WHILE j < drawnSize DO
    IF drawn[j] == cardIndex THEN
        alreadyDrawn = 1
    END
    j = j + 1
END

//---- Redrawing and checking until we find a new card 
WHILE alreadyDrawn == 1 DO
    cardIndex = RANDOM(0, 51)
    alreadyDrawn = 0
    j = 0
    WHILE j < drawnSize DO
        IF drawn[j] == cardIndex THEN
            alreadyDrawn = 1
        END
        j = j + 1
    END
END
APPEND cardIndex TO drawn
drawnSize = drawnSize + 1
APPEND deck[cardIndex] TO playerHand
playerSize = playerSize + 1

//---Draw card 2 - player
cardIndex = RANDOM(0, 51)
alreadyDrawn = 0
j = 0
WHILE j < drawnSize DO
    IF drawn[j] == cardIndex THEN
        alreadyDrawn = 1
    END
    j = j + 1
END
WHILE alreadyDrawn == 1 DO
    cardIndex = RANDOM(0, 51)
    alreadyDrawn = 0
    j = 0
    WHILE j < drawnSize DO
        IF drawn[j] == cardIndex THEN
            alreadyDrawn = 1
        END
        j = j + 1
    END
END
APPEND cardIndex TO drawn
drawnSize = drawnSize + 1
APPEND deck[cardIndex] TO playerHand
playerSize = playerSize + 1

//----Draw card 1 - dealer
cardIndex = RANDOM(0, 51)
alreadyDrawn = 0
j = 0
WHILE j < drawnSize DO
    IF drawn[j] == cardIndex THEN
        alreadyDrawn = 1
    END
    j = j + 1
END
WHILE alreadyDrawn == 1 DO
    cardIndex = RANDOM(0, 51)
    alreadyDrawn = 0
    j = 0
    WHILE j < drawnSize DO
        IF drawn[j] == cardIndex THEN
            alreadyDrawn = 1
        END
        j = j + 1
    END
END
APPEND cardIndex TO drawn
drawnSize = drawnSize + 1
APPEND deck[cardIndex] TO dealerHand
dealerSize = dealerSize + 1

//----Draw card 2 - dealer
cardIndex = RANDOM(0, 51)
alreadyDrawn = 0
j = 0
WHILE j < drawnSize DO
    IF drawn[j] == cardIndex THEN
        alreadyDrawn = 1
    END
    j = j + 1
END
WHILE alreadyDrawn == 1 DO
    cardIndex = RANDOM(0, 51)
    alreadyDrawn = 0
    j = 0
    WHILE j < drawnSize DO
        IF drawn[j] == cardIndex THEN
            alreadyDrawn = 1
        END
        j = j + 1
    END
END
APPEND cardIndex TO drawn
drawnSize = drawnSize + 1
APPEND deck[cardIndex] TO dealerHand
dealerSize = dealerSize + 1

// --- Show hands ---
i = 0
SHOW "Player Hand"
WHILE i < playerSize DO
    SHOW playerHand[i]
    playerScore = playerScore + playerHand[i]
    i = i + 1
END

i = 0
SHOW "Dealer Hand"
WHILE i < dealerSize DO
    SHOW dealerHand[i]
    dealerScore = dealerScore + dealerHand[i]
    i = i + 1
END

SHOW " "
SHOW "Player Score"
SHOW playerScore
SHOW " "
SHOW "Dealer Score"
SHOW dealerScore

IF playerScore > 21 THEN
    SHOW "Bust"
ELSE
    SHOW "Safe"
END