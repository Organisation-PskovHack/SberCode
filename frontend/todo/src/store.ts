type Note = {
    id: string;
    title: string;
    completed: boolean;
};

type State = {
    notes: Array<Note>;
};

type Action =
    | {
          type: 'init';
          notes: Array<Note>;
      }
    | {
          type: 'add_note';
          note: string;
      }
    | {
          type: 'done_note';
          note: string;
      }
    | {
        type: 'undone_note';
        note: string;
      }
    | {
        type: 'delete_note';
        note: string;
    };


export const reducer = (state: State, action: Action) => {
    switch (action.type) {
        case 'init':
            return {
                ...state,
                notes: [...action.notes],
            };

        case 'add_note':
            return {
                ...state,
                notes: [
                    ...state.notes,
                    {
                        id: Math.random().toString(36).substring(7),
                        title: action.note,
                        completed: false,
                    },
                ],
            };

        case 'done_note':
            return {
                ...state,
                notes: state.notes.map((note) => (note.title === action.note ? { ...note, completed: true } : note)),
            };
        case 'undone_note':
            return {
                ...state,
                notes: state.notes.map((note) => (note.title === action.note ? { ...note, completed: false } : note)),
            };

        case 'delete_note':
            return {
                ...state,
                notes: state.notes.filter(({ title }) => title !== action.note),
            };

        default:
            throw new Error();
    }
};
