import * as functions from 'firebase-functions';
// import { response } from 'express';
// import * as admin from 'firebase-admin'

// // Start writing Firebase Functions
// // https://firebase.google.com/docs/functions/typescript
//
// export const helloWorld = functions.https.onRequest((request, response) => {
//  response.send("Hello from Firebase!");
// });

export const myNotificaionService=functions.database.ref('user-chat/{channel-id}/{msg-id}').onWrite((change, context)=>{
    console.log(" Enter in Message ");
    
    if(change!=null && context!=null  && change.after!=null){
        const messageData = change.after.val();
        console.log(messageData);
    return messageData;    }

})