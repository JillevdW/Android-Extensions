# didSet

I found this extension on Stack Overflow when I was trying to get the `didSet` and `willSet` functionality I often use in Swift.

- [Usage](#usage)
    - **Intro -** [How to use](#how-to-use)
    - **Functions -** [didSet](#didSet), [willSet](#willSet)


## Installation

Simply download the Extension+didSet.kt file and put it in your project directory.

## Usage

### Intro

#### How to use

After adding the file to your project directory, you can now use `didSet` and `willSet` like they are used in Swift. 


## Functions

### didSet

The `didSet` block can be used for a lot of different things, but most notably for setting UI elements when a value is set.

```kotlin

var value: String? by observing(null, didSet = {
    if (value != null) {
        // Use the value here, for example to set the text of a TextView.
    }
})
```

### willSet

The `willSet` block if useful if you want some code to execute before the value is set.

```kotlin

var value: String? by observing(null, willSet = {
    if (value != null) {
        // Use the value here, for example to set the text of a TextView.
    }
})
```


## Author

Jille van der Weerd

## License

Do with it whatever you please.
