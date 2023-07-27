# This project represents the bug for mapstruct 1.5.5.Final

## Project Structure
The project contains:
1. [SimpleModel](./src/main/java/org/example/domain/SimpleModel.java) represents some domain model
2. [SimpleModelDto.java](src%2Fmain%2Fjava%2Forg%2Fexample%2Fdto%2FSimpleModelDto.java) represents information about DTO model
3. [SimpleModelResponse.java](src%2Fmain%2Fjava%2Forg%2Fexample%2Fdto%2FSimpleModelResponse.java) contains the response information.

## Project Ideology
Assume that I want to map the `Stream<SimpleModel>` to the simple json model:
```json
{
  "items": [
    {
      "name": "bla-bla"
    }
  ]
}
```

I can declare a simple Mapstruct interface [SimpleMapper.java](src%2Fmain%2Fjava%2Forg%2Fexample%2FSimpleMapper.java). And declare a simple mapping method:
`SimpleModelResponse toDto(Stream<SimpleModel> model);`. However, I receive the error in compile time:
```
error: Can't generate mapping method from iterable type from java stdlib to non-iterable type.
```
If I declare the method `SimpleModelResponse toDto(Collection<SimpleModel> model);` then everything is fine
