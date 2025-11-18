# aws_cloudwatch

## EKS: Helm chart create/updates by users
```
fields @timestamp, @message, @logStream, @log
| filter verb in ["create", "update"]
| filter ispresent(`user.extra.sessionName.0`)
| filter ispresent(`requestObject.metadata.annotations.meta.helm.sh/release-name`)
| filter `user.username` like "arn:aws:sts::*:assumed-role/"
| sort @timestamp desc
| limit 100
```