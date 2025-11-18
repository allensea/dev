# AWS

## Read AWS SSO CLI cached credentials for use with Terraform
```
# ~/.aws/config

[profile terraform]
credential_process = aws configure export-credentials --profile <<profile_name>>
```

## Use SSO credentials with Docker run
```
env $(aws configure export-credentials --profile sso-profile-name --format env-no-export) docker run -it -e AWS_ACCESS_KEY_ID -e AWS_SECRET_ACCCESS_KEY alpine
```

