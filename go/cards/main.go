package main

func main() {
	// var card string = "Ace of Spades"
	// cards := newDeck()
	// hand, remainingCards := deal(cards, 5)

	// hand.print()
	// remainingCards.print()
	// cards := newDeck()
	// cards.saveToFile("my_cards")
	cards := newDeckFromFile("my")
	cards.print()
}