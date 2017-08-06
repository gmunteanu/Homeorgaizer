create table `Ownership`(
	PersonId INT NOT NULL,    
    ItemId INT NOT NULL,
    FOREIGN KEY (PersonId) REFERENCES Persons(PersonId),
	FOREIGN KEY (ItemId) REFERENCES items(ItemId)
);

select persons.PersonName, items.ItemName, items.LastMove,storagespaces.StorageSpaceName, storagespaces.Location
from (((ownership
INNER JOIN persons ON ownership.PersonId = persons.PersonId)
INNER JOIN items ON ownership.ItemId = items.ItemId)
INNER JOIN storagespaces ON storagespaces.StorageSpaceId = items.StorageSpaceId);

UPDATE storagespaces set location = 1 where storagespaceID = 2;
UPDATE storagespaces set location = null where storagespaceID = 1;

select * from storagespaces;