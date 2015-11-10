String cardEntry
String suit1, suit2, suit3, suit4, suit5, card1
int cardOrder1, cardOrder2, cardOrder3, cardOrder4, cardOrder5
int cardInt1, cardInt2, cardInt3, cardInt4, cardInt5
boolean validCard = false


// capture card number 1


while (!validCard) {
	
	println "enter card number: "
	card1 = System.console().readLine()
	
	if (card1 == "1") {
		cardInt1 = 1
		validCard = true;
	}
	if (card1 == "2") {
		cardInt1 = 2
		validCard = true;
	}
	if (card1 == "3") {
		cardInt1 = 3
		validCard = true
	}
	if (card1 == "4") {
		cardInt1 = 4
		validCard = true
	}
	if (card1 == "5") {
		cardInt1 = 5
		validCard = true
	}
	if (card1 == "6") {
		cardInt1 = 6
		validCard = true
	}
	if (card1 == "7") {
		cardInt1 = 7
		validCard = true
	}
	if (card1 == "8") {
		cardInt1 = 8
		validCard = true
	}
	if (card1 == "9") {
		cardInt1 = 9
		validCard = true
	}
	if (card1 == "10") {
		cardInt1 = 10
		validCard = true
	} 
	if (card1 == "j") {
		cardInt1 = 11
		validCard = true;
	}
	if (card1 == "q") {
		cardInt1 = 12
		validCard = true
	}
	if (card1 == "k") {
		cardInt1 = 13
		validCard = true
	}

	if (!validCard) {
		println "please enter a valid card"
	}
	
}

// collect suit of card 1

validCard = false
while (!validCard) {
	
	println "enter card suit: "
	card1 = System.console().readLine()
	
	if (card1 == "clubs" || card1 == "spades" || card1 == "diamonds" || card1 == "hearts") {
		suit1 = card1
		validCard = true;
	}
}

// collect number of card 2

validCard = false
while (!validCard) {
	
	println "enter card number: "
	card1 = System.console().readLine()
	
	if (card1 == "1") {
		cardInt2 = 1
		validCard = true;
	}
	if (card1 == "2") {
		cardInt2 = 2
		validCard = true;
	}
	if (card1 == "3") {
		cardInt2 = 3
		validCard = true
	}
	if (card1 == "4") {
		cardInt2 = 4
		validCard = true
	}
	if (card1 == "5") {
		cardInt2 = 5
		validCard = true
	}
	if (card1 == "6") {
		cardInt2 = 6
		validCard = true
	}
	if (card1 == "7") {
		cardInt2 = 7
		validCard = true
	}
	if (card1 == "8") {
		cardInt2 = 8
		validCard = true
	}
	if (card1 == "9") {
		cardInt2 = 9
		validCard = true
	}
	if (card1 == "10") {
		cardInt2 = 10
		validCard = true
	} 
	if (card1 == "j") {
		cardInt2 = 11
		validCard = true;
	}
	if (card1 == "q") {
		cardInt2 = 12
		validCard = true
	}
	if (card1 == "k") {
		cardInt2 = 13
		validCard = true
	}

	if (!validCard) {
		println "please enter a valid card"
	}
	
}

// order card 2 against card 1
if (cardInt2 >= cardInt1) {
	cardOrder1 = cardInt1
	cardOrder2 = cardInt2;

	} else if (cardInt2 <= cardInt1) {
		cardOrder1 = cardInt2
		cardOrder2 = cardInt1;
	}


// collect suit of card 2

validCard = false
while (!validCard) {
	
	println "enter card suit: "
	card1 = System.console().readLine()
	
	if (card1 == "clubs" || card1 == "spades" || card1 == "diamonds" || card1 == "hearts") {
		suit2 = card1
		validCard = true;
	}
}


// collect number of card 3

validCard = false
while (!validCard) {
	
	println "enter card number: "
	card1 = System.console().readLine()
	
	if (card1 == "1") {
		cardInt3 = 1
		validCard = true;
	}
	if (card1 == "2") {
		cardInt3 = 2
		validCard = true;
	}
	if (card1 == "3") {
		cardInt3 = 3
		validCard = true
	}
	if (card1 == "4") {
		cardInt3 = 4
		validCard = true
	}
	if (card1 == "5") {
		cardInt3 = 5
		validCard = true
	}
	if (card1 == "6") {
		cardInt3 = 6
		validCard = true
	}
	if (card1 == "7") {
		cardInt3 = 7
		validCard = true
	}
	if (card1 == "8") {
		cardInt3 = 8
		validCard = true
	}
	if (card1 == "9") {
		cardInt3 = 9
		validCard = true
	}
	if (card1 == "10") {
		cardInt3 = 10
		validCard = true
	} 
	if (card1 == "j") {
		cardInt3 = 11
		validCard = true;
	}
	if (card1 == "q") {
		cardInt3 = 12
		validCard = true
	}
	if (card1 == "k") {
		cardInt3 = 13
		validCard = true
	}

	if (!validCard) {
		println "please enter a valid card"
	}
	
}

//order card 3 against card 2 and 1
if (cardInt3 >= cardOrder2) {
	cardOrder3 = cardInt3	
	} else if (cardInt3 <= cardOrder1) {
		cardOrder3 = cardOrder2
		cardOrder2 = cardOrder1
		cardOrder1 = cardInt3;
		} else if (cardInt3 <= cardOrder2) {
			cardOrder3 = cardOrder2
			cardOrder2 = cardInt3
		}



// collect suit of card 3

validCard = false
while (!validCard) {
	
	println "enter card suit: "
	card1 = System.console().readLine()
	
	if (card1 == "clubs" || card1 == "spades" || card1 == "diamonds" || card1 == "hearts") {
		suit3 = card1
		validCard = true;
	}
}


// collect number of card 4

validCard = false
while (!validCard) {
	
	println "enter card number: "
	card1 = System.console().readLine()
	
	if (card1 == "1") {
		cardInt4 = 1
		validCard = true;
	}
	if (card1 == "2") {
		cardInt4 = 2
		validCard = true;
	}
	if (card1 == "3") {
		cardInt4 = 3
		validCard = true
	}
	if (card1 == "4") {
		cardInt4 = 4
		validCard = true
	}
	if (card1 == "5") {
		cardInt4 = 5
		validCard = true
	}
	if (card1 == "6") {
		cardInt4 = 6
		validCard = true
	}
	if (card1 == "7") {
		cardInt4 = 7
		validCard = true
	}
	if (card1 == "8") {
		cardInt4 = 8
		validCard = true
	}
	if (card1 == "9") {
		cardInt4 = 9
		validCard = true
	}
	if (card1 == "10") {
		cardInt4 = 10
		validCard = true
	} 
	if (card1 == "j") {
		cardInt4 = 11
		validCard = true;
	}
	if (card1 == "q") {
		cardInt4 = 12
		validCard = true
	}
	if (card1 == "k") {
		cardInt4 = 13
		validCard = true
	}

	if (!validCard) {
		println "please enter a valid card"
	}
	
}

// order card 4 against 3, 2, 1
if (cardInt4 >= cardOrder3) {
	cardOrder4 = cardInt4;
	} else if (cardInt4 <= cardOrder1) {
		cardOrder4 = cardOrder3
		cardOrder3 = cardOrder2
		cardOrder2 = cardOrder1
		cardOrder1 = cardInt4;
		} else if (cardInt4 <= cardOrder2) {
			cardOrder4 = cardOrder3
			cardOrder3 = cardOrder2
			cardOrder2 = cardInt4;
			} else if (cardInt4 <= cardOrder3) {
				cardOrder4 = cardOrder3
				cardOrder3 = cardInt4;
			}



// collect suit of card 4

validCard = false
while (!validCard) {
	
	println "enter card suit: "
	card1 = System.console().readLine()
	
	if (card1 == "clubs" || card1 == "spades" || card1 == "diamonds" || card1 == "hearts") {
		suit4 = card1
		validCard = true;
	}
}


// collect number of card 5

validCard = false
while (!validCard) {
	
	println "enter card number: "
	card1 = System.console().readLine()
	
	if (card1 == "1") {
		cardInt5 = 1
		validCard = true;
	}
	if (card1 == "2") {
		cardInt5 = 2
		validCard = true;
	}
	if (card1 == "3") {
		cardInt5 = 3
		validCard = true
	}
	if (card1 == "4") {
		cardInt5 = 4
		validCard = true
	}
	if (card1 == "5") {
		cardInt5 = 5
		validCard = true
	}
	if (card1 == "6") {
		cardInt5 = 6
		validCard = true
	}
	if (card1 == "7") {
		cardInt5 = 7
		validCard = true
	}
	if (card1 == "8") {
		cardInt5 = 8
		validCard = true
	}
	if (card1 == "9") {
		cardInt5 = 9
		validCard = true
	}
	if (card1 == "10") {
		cardInt5 = 10
		validCard = true
	} 
	if (card1 == "j") {
		cardInt5 = 11
		validCard = true;
	}
	if (card1 == "q") {
		cardInt5 = 12
		validCard = true
	}
	if (card1 == "k") {
		cardInt5 = 13
		validCard = true
	}

	if (!validCard) {
		println "please enter a valid card"
	}
	
}

// order card 5 against 4, 3, 2, 1
if (cardInt5 >= cardOrder4) {
	cardOrder5 = cardInt5
	} else if (cardInt5 < cardOrder1) {
		cardOrder5 = cardOrder4
		cardOrder4 = cardOrder3
		cardOrder3 = cardOrder2
		cardOrder2 = cardOrder1
		cardOrder1 = cardInt5;
		} else if (cardInt5 <= cardOrder2) {
			cardOrder5 = cardOrder4
			cardOrder4 = cardOrder3
			cardOrder3 = cardOrder2
			cardOrder2 = cardInt5;
			} else if (cardInt5 <= cardOrder3) {
				cardOrder5 = cardOrder4
				cardOrder4 = cardOrder3
				cardOrder3 = cardInt5;
				} else if (cardInt5 <= cardOrder4) {
					cardOrder5 = cardOrder4
					cardOrder4 = cardInt4;
				} 


// collect suit of card 5

validCard = false
while (!validCard) {
	
	println "enter card suit: "
	card1 = System.console().readLine()
	
	if (card1 == "clubs" || card1 == "spades" || card1 == "diamonds" || card1 == "hearts") {
		suit5 = card1
		validCard = true;
	}
}

println "1"

// finally finished capturing cards!
int straightDeterminer
straightDeterminer = cardOrder1 + 4

boolean foundbestHand = false
int straightcardInt
String bestHand


// WHILE LOOP STARTS HERE


while (!foundbestHand) {
	println "straightdeterminer is" + straightDeterminer
	println "cardorder5" + cardOrder5

	if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
		if (straightDeterminer == cardOrder5) {
			bestHand = "straight flush"
			foundbestHand = true;
		} else {
			bestHand = "flush"
			foundbestHand = true;
		}
		
	}

	if (straightDeterminer == cardOrder5) {
			bestHand = "straight"
			foundbestHand = true;
		} 

	int pokerDeterminerLow
	pokerDeterminerLow = cardOrder1 + 1
	int pokerDeterminerHigh
	pokerDeterminerHigh = cardOrder2 + 1


	println "2"


// a branch for determining a  poker - four of a kind

	if (cardOrder1 == cardOrder4 || cardOrder2 == cardOrder5) {
		bestHand = "Poker"
		foundbestHand = true;
	}


// a branch for determining a  full house

	if (cardOrder1 == cardOrder2 && cardOrder1 == cardOrder3 && cardOrder4 != cardOrder5) {
		bestHand = "full house"
		foundbestHand = true;
		} 
	if (cardOrder1 == cardOrder2 && cardOrder3 == cardOrder4 && cardOrder3 == cardOrder5) {
			bestHand = "full house"
			foundbestHand = true;
		}

		println "3"

// a branch for determining a  flush

//	if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
//		bestHand = "flush"
//		foundbestHand = true;

//	}

	// a branch for determining a straight 
	
// determine if straight starts on first card
//straightcardInt = cardInt1 + 1
// if (straightcardInt == cardInt2 || straightcardInt == cardInt3 || straightcardInt == cardInt4 || straightcardInt == cardInt5) {
//	straightcardInt = cardInt2 + 1
//	if (straightcardInt == cardInt3 || straightcardInt == cardInt4 || straightcardInt == cardInt5) {
//		straightcardInt = cardInt3 + 1
//		if (straightcardInt == cardInt4 || straightcardInt == cardInt5) {
//			straightcardInt = cardInt4 + 1 {
//				if (straightcardInt == cardInt5)
//				bestHand = straight
//
//			}
//
//
//		}
//
//
//	}
//}

// determine if straight starts on second card

//straightcardInt = cardInt2 + 1
//if (straightcardInt == cardInt1 || straightcardInt == cardInt3 || straightcardInt == cardInt4 || straightcardInt == cardInt5) {
//	straightcardInt = cardInt2 + 1
//	if (straightcardInt == cardInt3 || straightcardInt == cardInt4 || straightcardInt == cardInt5) {
//		straightcardInt = cardInt3 + 1
//		if (straightcardInt == cardInt4 || straightcardInt == cardInt5) {
//			straightcardInt = cardInt4 + 1 {
//				if (straightcardInt == cardInt5)
//
	//		}
//
//
//		}
//
//
	//}
//}



// a branch for determining a  three of a kind OR a pair OR two pair

	if (cardOrder1 == cardOrder2) {
		if (cardOrder1 == cardOrder3 && cardOrder1 != cardOrder4 && cardOrder1 != cardOrder5) {
			bestHand = "three of a kind"
			foundbestHand = true;

		}	else if (cardOrder3 == cardOrder4 || cardOrder4 == cardOrder5) {
				bestHand = "two pair"
				foundbestHand = true;
				}	else {
					bestHand = "pair"
					foundbestHand = true;
					}
	}
	if (cardOrder4 == cardOrder5) {
		if (cardOrder5 == cardOrder3 && cardOrder5 != cardOrder2 && cardOrder5 != cardOrder1) {
			bestHand = "three of a kind"
			foundbestHand = true;
		} else if (cardOrder3 == cardOrder2 || cardOrder2 == cardOrder1) {
				bestHand = "two pair"
				foundbestHand = true;

			} 

			else {
				bestHand = "pair"
				foundbestHand = true;
			}


		
	}
	if (cardOrder2 == cardOrder3) {
		if (cardOrder2 == cardOrder4 && cardOrder2 != cardOrder5 && cardOrder2 != cardOrder1) {
			bestHand = "three of a kind"
			foundbestHand = true;
		} else if (cardOrder4 == cardOrder5) {
				bestHand = "two pair"
				foundbestHand = true;
			} 
			else {
				bestHand = "pair"
				foundbestHand = true;
			}
		

		println "4"
	}	








// a branch for determining a  two pairs



// a branch for determining a  nothin
//bestHand = (foundbestHand == false) ? "nothing!" : bestHand;  	
//foundbestHand = (bestHand == "nothing") ? true : false;

if (foundbestHand == false) {
	bestHand = "nothing!"
	foundbestHand = true;
	
}

println "5"

}


println "your best hand is a " + bestHand;