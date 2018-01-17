import android.animation.AnimatorSet
import android.os.Handler

fun AnimatorSet.executeHere(execute: Runnable, delay: Long) {
    var animationDelay: Long = this.childAnimations.last().duration + this.childAnimations.last().startDelay
    Handler().postDelayed({
        execute.run()
    },animationDelay + delay)
}

fun AnimatorSet.onFinish(execute: Runnable, delay: Long) {
    Handler().postDelayed({
        execute.run()
    }, this.totalDuration + delay)
}