# AnimatorSet

I made this extension when I wanted to remove views after an animations (when they're unused) as to lower the RAM footprint of the application. Later I discovered I could use the function to execute functions at certain point during a running AnimatorSet.

- [Features](#features)
- [Usage](#usage)
    - **Intro -** [How to use](#how-to-use)
    - **Functions -** [executeHere](#executehere), [onFinish](#onfinish)

## Requirements
- API level 11+ for the executeHere function
- API level 24+ for the onFinish function (executeHere can function as onFinish just as well)

## Installation

Simply download the Extension+AnimatorSet.kt file and put it in your project directory.

## Usage

### Intro

#### How to use

Simply call one of the functions on an AnimatorSet object.

```kotlin

val set = AnimatorSet()
//add animations to the set here
set.onFinish(Runnable {
    //code to execute once the set is finished
},delay)
```

## Functions

### executeHere

The executeHere function is to be used during the creation of a set. It will allow to execute blocks of code at the given point during the location.

```kotlin

val set = AnimatorSet()
//add animations with durations and startdelays
set.executeHere(Runnable {
    //code to execute at this point
}, delay) //you can add a delay here if you want.
//add more animations.
```

The executeHere function can also perfectly work like the onFinish function, the latter just has cleaner code. When you want to execute code on finish with the executeHere function you can simply add it at the end of the set creation.

### onFinish

With the introduction of API level 24, we get access to the totalDuration property (or getTotalDuration accessor in Java). Using this, we can make the onFinish function a tad cleaner (nothing changes on call-time).

```kotlin

val set = AnimatorSet()
//add animations to the set here
set.onFinish(Runnable {
//code to execute once the set is finished
},delay)
```



## Features

- [x] Execute blocks of code during an animations
- [x] Execute blocks of code after an animation has finished
- [x] Specify an additional delay
- [ ] Add some syntactic sugar to AnimatorSet


## Author

Jille van der Weerd

## License

Do with it whatever you please.
