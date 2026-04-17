SHOW "Welcome to Blackjack"
LET playerScore = 0
LET playerHand = []
LET playerSize = 0
LET dealerScore = 0
LET dealerHand = []
LET dealerSize = 0

LET addNum = RANDOM(1, 13)
APPEND addNum TO playerHand
playerSize = playerSize + 1
addNum = RANDOM(1, 13)
APPEND addNum TO playerHand
playerSize = playerSize + 1

addNum = RANDOM(1, 13)
APPEND addNum TO dealerHand
dealerSize = dealerSize + 1
addNum = RANDOM(1, 13)
APPEND addNum TO dealerHand
dealerSize = dealerSize + 1


LET i = 0
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