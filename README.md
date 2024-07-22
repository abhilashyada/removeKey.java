For this problem, the prefilled code will contain two arrays names
Ni and their games Gi (corresponding to the names at the sameindex in Ni)
. Convert these two arrays into a HashMap with names Ni as keys and games Gi as their corresponding values.
Write a program to update the value of the given key in the HashMap and print them in sorted order by key.

Input

The input will be a single line containing the strings, separated by space, denoting the key-value pair.

Output

Each line of the output contains key-value pair separated by with the updated value to the given key.

Explanation

For example, the given two arrays are names and games in
the prefilled code.
Convert these two arrays to HashMap containing keys and values as,
{Ram Cricket, Naresh Football, Vani Tennis,Rahim=Cricket, Deepak Boxing}

If the given string is "Rahim Hockey", your code should update the key "Rahim" with the value "Hockey" and print HashMap in sorted order based on the key. So the output should be

Deepak: Boxing
Naresh: Football
Rahim: Hockey
Ram: Cricket
Vani: Tennis
