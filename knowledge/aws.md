# AWS

## Read AWS SSO CLI cached credentials for use with Terraform
```
# ~/.aws/config

[profile terraform]
credential_process = aws configure export-credentials --profile <<profile_name>>
```
