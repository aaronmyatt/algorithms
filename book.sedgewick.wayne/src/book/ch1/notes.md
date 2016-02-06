# Algorithms - by Sedgewick and Wayne
## Chapter 1: `Fundamentals`

- *Algorithms go hand in hand with data structures.*
- *A finite, deterministic and effective problem solving method suitable for implementation as a computer program.*

> Algorithms can be described in a written language:
```txt
Compute the greatest common divisor (gcd) of two none negative integers, p and q, as follows:
If q is 0, the answer is p. If not, divide p by q and take the remainder, r. The answer is the gcd of q and r.
```

> Or in a computer programming language:
```java
public static int gcd(int p, int q){
    if(q == 0) return p;
    int r = p % q;
    return gcd(q, r);
}
```

> Compare:
```java
public static int gcd(int p, int q){
    if(q == 0) return p;    // If q is 0, the answer is p.
    int r = p % q;          // If not, divide p by q, and take the remainder, r.
    return gcd(q, r);       // The answer is the gcd of q and r.
}
```


>Example:
p,q = 20,15
Depth=0
5 = 20%15

>p,q = 15,5
depth=2
0 = 15%5

>Answer = 5


- *In times of complexity and computational intensity, we 'quickly become motivated to divise methods that use time and space efficiently.*
- *In some cases algorithms can enable us 'to do that which would otherwise be impossible.*

## Chapter 1.1: `Basic Programming Model`
*Essentially a refresher/introdction to Java. Useful!*