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
  
  ![StartScreen](https://firebasestorage.googleapis.com/v0/b/storeage-unit.appspot.com/o/Screenshot_2019-06-12-22-23-22%5B1%5D.png?alt=media&token=fca5b7ca-7d54-4ce7-8184-82dae2c3ffd7)
  
  ![Gameplay](https://firebasestorage.googleapis.com/v0/b/storeage-unit.appspot.com/o/Screenshot_2019-06-12-22-23-41%5B1%5D.png?alt=media&token=e3a08605-a2a3-46c9-82f7-a926d9fa4437)
