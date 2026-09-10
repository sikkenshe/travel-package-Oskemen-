# Task 1: Builder Pattern

## Topic
Travel Package Builder — Oskemen and East Kazakhstan

The project demonstrates two different forms of representation using the Builder Pattern:
1. `TravelPackage` Java object
2. Text (String) representing the travel itinerary

## Predefined configurations
- Oskemen city break
- Katon-Karagay nature tour

## Components
- Product: `TravelPackage`
- Builder: `TravelPackageBuilder`
- Concrete Builder 1: `TravelPackageObjectBuilder`
- Concrete Builder 2: `ItineraryBuilder`
- Director: `TravelPackageDirector`
- Client: `Main`

## Requirements
- Fluent API
- Two concrete builders
- Two forms of representation
- Director using only the Builder interface
- Immutable Product
- Validation
- No "magic numbers" or "magic strings"
- Clean Code principles

## Git commits
1. Initial project structure
2. Addition of the immutable travel package product
3. Addition of the Builder interface
4. Addition of the object builder with validation
5. Addition of the itinerary builder
6. Oskemen and Katon-Karagay configurations addition
7. Adding the client demonstration
8. Adding the README and UML