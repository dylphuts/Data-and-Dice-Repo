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
WHILE i < dealerSize - 1 DO
    SHOW dealerHand[i]
    i = i + 1
END

i = 0
WHILE i < dealerSize DO
    dealerScore = dealerScore + dealerHand[i]
    i = i + 1
END

SHOW " "
SHOW "Player Score"
SHOW playerScore
SHOW " "
SHOW "Dealer Score"
SHOW dealerScore

// --- Player turn ---
LET playing = 1
WHILE playing == 1 DO
    SHOW " "
    SHOW "1 = Hit, 2 = Stand"
    INPUT choice

    IF choice == 1 THEN
        // Draw a new card for player
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

        // Recompute player score
        playerScore = 0
        i = 0
        WHILE i < playerSize DO
            playerScore = playerScore + playerHand[i]
            i = i + 1
        END

        // Show updated hand
        SHOW "Your hand:"
        i = 0
        WHILE i < playerSize DO
            SHOW playerHand[i]
            i = i + 1
        END
        SHOW "Your score:"
        SHOW playerScore

        IF playerScore > 21 THEN
            SHOW "You busted!"
            playing = 0
        END
    END

    IF choice == 2 THEN
        playing = 0
    END
END

// --- Dealer turn ---
SHOW " "
SHOW "Dealer reveals hand"
i = 0
WHILE i < dealerSize DO
    SHOW dealerHand[i]
    i = i + 1
END
SHOW "Dealer score:"
SHOW dealerScore

WHILE dealerScore < 17 DO
    // Dealer draws
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

    // Recompute dealer score
    dealerScore = 0
    i = 0
    WHILE i < dealerSize DO
        dealerScore = dealerScore + dealerHand[i]
        i = i + 1
    END

    SHOW "Dealer draws:"
    SHOW dealerHand[dealerSize - 1]
    SHOW "Dealer score:"
    SHOW dealerScore
END

// --- Final result ---
SHOW " "
IF dealerScore > 21 THEN
    SHOW "Dealer busted! You win!"
ELSE
    IF playerScore > 21 THEN
        SHOW "You busted! Dealer wins."
    ELSE
        IF playerScore > dealerScore THEN
            SHOW "You win!"
        ELSE
            IF playerScore == dealerScore THEN
                SHOW "Push - its a tie!"
            ELSE
                SHOW "Dealer wins."
            END
        END
    END
END