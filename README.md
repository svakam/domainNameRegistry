# Domain Name Registry

## Problem Domain
Implement a DNR system. 

Businesses can interact with a domain registrar. This allows them to: 1. Purchase a domain name, 2. Get info about their currently registered 
domain name/s, 3. Renew a domain name, and 4. Delete a domain name. 

In each of these actions, a request/response architecture is implemented. 
- Purchase a domain name
  - Request
    - Domain name
    - Period of registration (value (int), unit (year))
    - Verified contact
      - Verification provider (ex. Provider-ABC)
      - Contact ID
  - Response
    - Domain name
    - Expiration date
- Get info
  - Request
    - Domain name
  - Response
    - Domain name
    - Domain expiration date
- Renew
  - Request
    - Name
    - Period of registration
  - Response
    - Name
    - Expiration
- Delete
  - Request
    - Name
  - Response
    - N/A (or success/failure indication)
    
Domain names must be at least 10 characters long. 

Verified contact IDs from one of the supported providers must be provided. The system should validate the input contact ID based on each
provider's format given. The system should also support changing the validation of a given provider or adding new providers. 

Each response should contain a message that the business can see, as a form of feedback on how the operation underwent. 

## Implementation

Possible entities are businesses (Business), providers (ex. ProviderABC or ProviderPQR), and responses (Response). Each business, when registered
with the DNR, has the potential to execute 1 of the 4 operations listed above. Each operation requires certain parameters (listed above) in order 
to execute successfully. The parameters are sent through a request specific to the type of operation, and a response is received from the DNR, 
also specific to the operation. 

Each provider is a type of provider, but has specifics associated with it, such as the contact ID and type of verification method. Each of these 
parameters is used uniquely for each provider. 

