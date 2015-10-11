String cardEntry
String suit1, suit2, suit3, suit4, suit5, card1
int cardOrder1, cardOrder2, cardOrder3, cardOrder4, cardOrder5
int cardInt1, cardInt2, cardInt3, cardInt4, cardInt5
boolean validCard = false


// capture card number 1


cardInt1 = 1
cardInt2 = 3
cardInt3 = 5
cardInt4 = 7
cardInt5 = 9

suit1 = "hearts"
suit2 = "diamonds"
suit3 = "clubs"
suit4 = "spades"
suit5 = "hearts"

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



// finally finished capturing cards!
int straightDeterminer = cardOrder1 + 4

boolean foundBestHand = false
int straightCardInt
while (!foundBestHand) {

// a branch for determining a straight flush

if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
	if (straightDeterminer == cardOrder5) {
	bestHand = "straight flush"
	foundBestHand = true;
	}

}


int pokerDeterminerLow = cardOrder1 + 1
int pokerDeterminerHigh = cardOrder2 + 1




// a branch for determining a  poker

if (pokerDeterminerLow == cardOrder4 || pokerDeterminerHigh == cardOrder5) {
	bestHand = "Poker"
	foundBestHand = true;
}


// a branch for determining a  full house

if (cardOrder1 == cardOrder2 && cardOrder1 == cardOrder3 && cardOrder4 != cardOrder5) {
	bestHand = "full house"
	foundBestHand = true;
} else if (cardOrder1 == cardOrder2 && cardOrder3 == cardOrder4 && cardOrder3 == cardOrder5) {
	bestHand = "full house"
	foundBestHand = true;
}

// a branch for determining a  flush

if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
	bestHand = flush
	foundBestHand = true

}

// a branch for determining a straight 
if (straightDeterminer == cardOrder5) {
	bestHand = "straight"
	foundBestHand = true;


}
// determine if straight starts on first card
//straightCardInt = cardInt1 + 1
// if (straightCardInt == cardInt2 || straightCardInt == cardInt3 || straightCardInt == cardInt4 || straightCardInt == cardInt5) {
//	straightCardInt = cardInt2 + 1
//	if (straightCardInt == cardInt3 || straightCardInt == cardInt4 || straightCardInt == cardInt5) {
//		straightCardInt = cardInt3 + 1
//		if (straightCardInt == cardInt4 || straightCardInt == cardInt5) {
//			straightCardInt = cardInt4 + 1 {
//				if (straightCardInt == cardInt5)
//				bestHand = straight
//
//			}
//
//
//		}
//
//
//	}
}

// determine if straight starts on second card

//straightCardInt = cardInt2 + 1
//if (straightCardInt == cardInt1 || straightCardInt == cardInt3 || straightCardInt == cardInt4 || straightCardInt == cardInt5) {
//	straightCardInt = cardInt2 + 1
//	if (straightCardInt == cardInt3 || straightCardInt == cardInt4 || straightCardInt == cardInt5) {
//		straightCardInt = cardInt3 + 1
//		if (straightCardInt == cardInt4 || straightCardInt == cardInt5) {
//			straightCardInt = cardInt4 + 1 {
//				if (straightCardInt == cardInt5)
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

if (cardorder1 == cardOrder2) {
	if (cardOrder1 == cardOrder3 && cardOrder1 != cardOrder4 && cardOrder1 != cardOrder5) {
		bestHand = "three of a kind"
		foundBestHand = true;

	} else if (cardOrder3 == cardOrder4 || cardOrder4 == cardOrder5) {
		besthand = "two pair"
		foundBestHand = true;
	}


	else {
		besthand = "pair"
		foundBestHand = true;
	}
if (cardOrder4 == cardOrder5) {
	if (cardOrder5 == cardOrder3 && cardOrder5 != cardOrder2 && cardOrder5 != cardOrder1) {
		bestHand = "three of a kind"
		foundBestHand = true;
	} else if (cardOrder3 == cardOrder2 || cardOrder2 == cardOrder1) {
		besthand = "two pair"
		foundBestHand = true;
		
	} 

	else {
		bestHand = "pair"
		foundBestHand = true;
	}
		
	
}
if (cardOrder2 == cardOrder3) {
	if (cardOrder2 == cardOrder4 && cardOrder2 != cardOrder5 && cardOrder2 != cardOrder1) {
		besthand = "three of a kind"
		foundBestHand = true;
	} else if (cardOrder4 == cardOrder5) {
		bestHand = "two pair"
		foundBestHand = true;
	} 
	else {
		besthand = "pair"
		foundBestHand = true;
	}
}
	






// a branch for determining a  two pairs



// a branch for determining a  nothin
bestHand = (foundBestHand == false) ? "nothing!" : besthand;  	
foundBestHand = (bestHand == "nothing") ? true : false;


}

println "your best hand is a " + bestHand;




 