# Barnyard-Breakout
Barnyard themed 2D infinite runner

## Classes

Android game written using LibGdx library. All assets (except font) have been created by me. Early stages of development, still in need of:
  - obstacles
  - animation
  - storing scores
  - improved user interface
  
Runner Class
  - This class stores the logic and texture for the users character, which is a bird that doesn't stop running

Obstacle Class
  - This class stores a single object that ends the game upon collision

BackgroundScroller Class
  - This class stores two backgrounds that continually move to simulate a running effect

GameplayScreen Class
  - This class stores the game world (in our case the barnWorld) and all its participants
  
MenuScreen Class
  - This class starts the game when the user taps the screen, used at the start of the game and when game ends

BackyardBreakout Class
  - This class is the containe for the Barnyard Breakout game
