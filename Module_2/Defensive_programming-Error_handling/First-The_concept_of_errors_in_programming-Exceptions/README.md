# When things go wrong.

## Exception
- Something was left out.
- Something was omitted deliberately.
- Rule nos followed.

## Error
- Mistake.
- Incorrect action.

## Exceptions can occur
- During compile time.
- During run time.
- In write `

**Exceptions**: Recovered by using correct exception-handling mechanisms.

## Errors happens:
- Abnormal condition.
- Cannot be recovered.
- Always occur at run time.
- Caused by a lack of system resources.

Errors cannot be handled in an application using exceptions-handling mechanisms.

## Clases representing Error and Exception:
[Photo](clases_ErrorException.png)

Depends when de exception and the error ocurs, can be categorized like:
- Compile time, also known, checked.
- Run time, also known, unchecked. 

**Exceptions**, that occur during compile time are known as checked exceptions or non-runtime exceptions.

# Exploring exception types.
- **Compiler**, check the code and says when its wrong.

**Throwable**, represents any unexpected behavior or an exceptional event that occurs during program execution.

An Throwable can be an exception or an error.
[Image with type of exceptions types](exceptionTypes)

Exception: 
- Runtime: unchecked.
- Compile time: checked.

**Checked Exceptions**. The compiler checks the code and signals that something is not right and that it needs to be handled.

**Unchecked Exceptions**. Not checked by the compiler. Anything that is not correct will pass on to the runtime.









